package tourDeMock.original;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import static java.util.Arrays.*;
import org.jmock.*;
import org.jmock.integration.junit4.*;
import org.jmock.lib.legacy.*;
import org.junit.*;
import org.junit.runner.*;
import tourDeMock.original.service.*;

@RunWith(JMock.class)
public final class EmailListServlet_JMockTest
{
   final Mockery mockery = new JUnit4Mockery();

   EmailListServlet servlet;

   HttpServletRequest request;
   HttpServletResponse response;
   EmailListService emailListService;

   public EmailListServlet_JMockTest()
   {
      mockery.setImposteriser(ClassImposteriser.INSTANCE);
   }

   @Before
   public void before() throws Exception
   {
      request = mockery.mock(HttpServletRequest.class);
      response = mockery.mock(HttpServletResponse.class);
      emailListService = mockery.mock(EmailListService.class);

      final ServletConfig servletConfig = mockery.mock(ServletConfig.class);

      mockery.checking(new Expectations()
      {
         final ServletContext servletContext = mockery.mock(ServletContext.class);

         {
            oneOf(servletConfig).getServletContext(); will(returnValue(servletContext));

            oneOf(servletContext).getAttribute(EmailListService.KEY);
            will(returnValue(emailListService));

            ignoring(request);
         }
      });

      servlet = new EmailListServlet();
      servlet.init(servletConfig);
   }

   @Test(expected = ServletException.class)
   public void doGetWithoutList() throws Exception
   {
      mockery.checking(new Expectations()
      {
         {
            oneOf(emailListService).getListByName(""); will(throwException(new EmailListNotFound()));
         }
      });

      servlet.doGet(request, response);
   }

   @Test
   public void doGetWithList() throws Exception
   {
      final PrintWriter writer = mockery.mock(PrintWriter.class);

      mockery.checking(new Expectations()
      {
         {
            List<String> list = asList("larry@stooge.com", "moe@stooge.com", "curley@stooge.com");
            oneOf(emailListService).getListByName(with(any(String.class))); will(returnValue(list));

            oneOf(response).getWriter(); will(returnValue(writer));

            Sequence printSequence = mockery.sequence("printSequence");
            oneOf(writer).println("larry@stooge.com"); inSequence(printSequence);
            oneOf(writer).println("moe@stooge.com"); inSequence(printSequence);
            oneOf(writer).println("curley@stooge.com"); inSequence(printSequence);
            oneOf(response).flushBuffer(); inSequence(printSequence);
         }
      });

      servlet.doGet(request, response);
   }
}
