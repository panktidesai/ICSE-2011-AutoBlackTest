package autoblacktest.actions.simple;

import java.io.IOException;

import resources.TesterHelper;

import autoblacktest.actions.parameters.ParameterNumberFormat;
import autoblacktest.actions.parameters.text.DataManager;

import com.rational.test.ft.object.interfaces.*;


public class PasswordFieldUI extends TesterHelper {
	
	public static void setText(TestObject testObject, long index) throws IOException {
		//recupero gli indici della hashmap dei dati
		long[] parameters=ParameterNumberFormat.getDoubleParameter(index);
		//recupero il valore da insierire dalla hashmap dei dati 
		String text=DataManager.getInstance().getData((int)parameters[0],(int)parameters[1]);
		new TextGuiSubitemTestObject(testObject).setProperty("text", text);
	}
	
	
	//old version
	/*
	public static void setText(TestObject testObject) throws IOException {
		if (testObject.getProperty("editable").toString().equals("true")) {
			String text = testObject.getProperty("text").toString();
			
			text = "password";
			

			new TextGuiSubitemTestObject(testObject).setText(text);
			// TopLevelTestObject top = (TopLevelTestObject)
			// testObject.getTopParent();
			// top.inputKeys("{TAB}");

		}
	}
	*/
//    public static void click(TestObject testObject) {
//        new TextGuiSubitemTestObject(testObject).click();
//    }
	
}

//PROPERTIES

/*
   {selectedTextColor=java.awt.Color[r=255,g=255,b=255]
   focusAccelerator= 
   validateRoot=true
   font=com.rational.test.ft.value.FontInfo[name=Calibri,style=0,size=12]
   caretPosition=0
   preferredScrollableViewportSize=java.awt.Dimension[width=6,height=22]
   size=java.awt.Dimension[width=139,height=22]
   location=java.awt.Point[x=148,y=84]
   focusTraversalKeysEnabled=true
   alignmentY=0.5
   alignmentX=0.5
   y=84
   selectionStart=0
   x=148
   preferredSize=java.awt.Dimension[width=6,height=22]
   backgroundSet=true
   verifyInputWhenFocusTarget=true
   editable=true
   displayable=true
   class=javax.swing.JPasswordField
   autoscrolls=true
   foregroundSet=true
   horizontalAlignment=10
   showing=true
   focusTraversalPolicyProvider=false
   fontSet=true
   dragEnabled=false
   preferredSizeSet=false
   scrollableTracksViewportWidth=false
   caretColor=java.awt.Color[r=0,g=0,b=0]
   focusTraversable=true
   visible=true
   background=java.awt.Color[r=255,g=217,b=217]
   uIClassID=PasswordFieldUI
   inheritsPopupMenu=false
   valid=true
   locationOnScreen=java.awt.Point[x=610,y=347]
   selectedText=null Object
   name=txtPassword
   foreground=java.awt.Color[r=0,g=0,b=0]
   mousePosition=null Object
   ignoreRepaint=false
   paintingTile=false
   focusTraversalPolicySet=false
   focusCycleRoot=false
   focusOwner=false
   enabled=true
   scrollableTracksViewportHeight=false
   lightweight=true
   scrollOffset=0
   opaque=true
   maximumSizeSet=false
   componentCount=0
   toolTipText=null Object
   height=22
   doubleBuffered=false
   selectionEnd=0
   minimumSizeSet=false
   width=139
   paintingForPrint=false
   selectionColor=java.awt.Color[r=49,g=106,b=197]
   managingFocus=false
   maximumSize=java.awt.Dimension[width=2147483647,height=2147483647]
   disabledTextColor=java.awt.Color[r=172,g=168,b=153]
   minimumSize=java.awt.Dimension[width=6,height=22]
   columns=0
   echoChar=?
   visibleRect=java.awt.Rectangle[x=0,y=0,width=139,height=22]
   text=
   optimizedDrawingEnabled=true
   debugGraphicsOptions=0
   requestFocusEnabled=true
   focus=false
   focusable=true
   bounds=java.awt.Rectangle[x=148,y=84,width=139,height=22]
   cursorSet=true}
*/
