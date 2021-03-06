package autoblacktest.actions.simple;

import java.io.IOException;

import resources.TesterHelper;

import autoblacktest.actions.parameters.ParameterNumberFormat;
import autoblacktest.actions.parameters.text.DataManager;

import com.rational.test.ft.object.interfaces.*;

public class EditorPaneUI extends TesterHelper {
	
	public static void setText(TestObject testObject, long index) throws IOException {
		//recupero gli indici della hashmap dei dati
		long[] parameters=ParameterNumberFormat.getDoubleParameter(index);
		//recupero il valore da insierire dalla hashmap dei dati 
		String text=DataManager.getInstance().getData((int)parameters[0],(int)parameters[1]);
		new TextGuiSubitemTestObject(testObject).setProperty("text", text);
	}

//    public static void click(TestObject testObject) {
//        new TextGuiSubitemTestObject(testObject).click();
//    }
/*
//public void com.rational.test.ft.object.interfaces.GuiTestObject.doubleClick()
    public static void doubleClick(TestObject testObject) {
        new TextGuiSubitemTestObject(testObject).doubleClick();
    }

//public void com.rational.test.ft.object.interfaces.GuiTestObject.drag()
    public static void drag(TestObject testObject) {
        new TextGuiSubitemTestObject(testObject).drag();
    }

//public void com.rational.test.ft.object.interfaces.GuiTestObject.hover()
    public static void hover(TestObject testObject) {
        new TextGuiSubitemTestObject(testObject).hover();
    }

//public void com.rational.test.ft.object.interfaces.TextGuiSubitemTestObject.setText(java.lang.String)
    public static void setText(TestObject testObject) {
        new TextGuiSubitemTestObject(testObject).setText("STRINGA");
    }


*/
}

//PROPERTIES

/*
   {backgroundSet=true
   visibleRect=java.awt.Rectangle[x=0,y=0,width=262,height=14]
   dragEnabled=false
   font=com.rational.test.ft.value.FontInfo[name=Candara,style=2,size=10]
   enabled=true
   focusable=true
   text=<html>
  <head>
    
  </head>
  <body>
    @ Tue Oct 12 12:24:04 CEST 2010 via <a href="http://www.hootsuite.com" rel="nofollow">HootSuite</a>
  </body>
</html>

   verifyInputWhenFocusTarget=true
   autoscrolls=true
   locationOnScreen=java.awt.Point[x=958,y=117]
   lightweight=true
   focusTraversalPolicySet=true
   y=51
   x=530
   paintingForPrint=false
   focusTraversalKeysEnabled=true
   componentCount=0
   preferredScrollableViewportSize=java.awt.Dimension[width=234,height=14]
   scrollableTracksViewportHeight=false
   selectedText=null Object
   size=java.awt.Dimension[width=262,height=14]
   selectedTextColor=java.awt.Color[r=255,g=255,b=255]
   minimumSize=java.awt.Dimension[width=47,height=14]
   maximumSize=java.awt.Dimension[width=2147483647,height=2147483647]
   editable=false
   contentType=text/html
   foreground=java.awt.Color[r=102,g=102,b=102]
   selectionStart=0
   valid=true
   location=java.awt.Point[x=530,y=51]
   selectionColor=java.awt.Color[r=49,g=106,b=197]
   managingFocus=false
   focusAccelerator= 
   toolTipText=null Object
   class=javax.swing.JEditorPane
   fontSet=true
   height=14
   focusTraversable=true
   paintingTile=false
   caretColor=java.awt.Color[r=0,g=0,b=0]
   preferredSize=java.awt.Dimension[width=234,height=14]
   width=262
   caretPosition=0
   uIClassID=EditorPaneUI
   focus=false
   name=editorStats
   foregroundSet=true
   scrollableTracksViewportWidth=false
   maximumSizeSet=false
   mousePosition=null Object
   validateRoot=false
   showing=true
   focusOwner=false
   focusTraversalPolicyProvider=false
   visible=true
   displayable=true
   focusCycleRoot=true
   debugGraphicsOptions=0
   opaque=false
   requestFocusEnabled=true
   bounds=java.awt.Rectangle[x=530,y=51,width=262,height=14]
   disabledTextColor=java.awt.Color[r=172,g=168,b=153]
   doubleBuffered=false
   ignoreRepaint=false
   inheritsPopupMenu=false
   optimizedDrawingEnabled=true
   background=java.awt.Color[r=255,g=255,b=255]
   alignmentY=0.5
   alignmentX=0.5
   minimumSizeSet=false
   cursorSet=false
   preferredSizeSet=false
   selectionEnd=0}
*/
