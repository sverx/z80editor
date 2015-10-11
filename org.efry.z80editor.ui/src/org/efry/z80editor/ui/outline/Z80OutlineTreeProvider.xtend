/*
 * generated by Xtext
 */
package org.efry.z80editor.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.efry.z80editor.z80.Asciitable
import org.efry.z80editor.z80.Command
import org.efry.z80editor.z80.Db
import org.efry.z80editor.z80.Define
import org.efry.z80editor.z80.Dsb
import org.efry.z80editor.z80.Dw
import org.efry.z80editor.z80.EmptyFill
import org.efry.z80editor.z80.IfCmd
import org.efry.z80editor.z80.IfOperand
import org.efry.z80editor.z80.IncludeType
import org.efry.z80editor.z80.LabelType
import org.efry.z80editor.z80.Macro
import org.efry.z80editor.z80.MacroUsage
import org.efry.z80editor.z80.MemoryMap
import org.efry.z80editor.z80.Org
import org.efry.z80editor.z80.Label
import org.efry.z80editor.z80.Asc
import org.efry.z80editor.z80.VarStruct
import org.efry.z80editor.z80.VarByte
import org.efry.z80editor.z80.VarWord
import org.efry.z80editor.z80.VarByteString
import org.efry.z80editor.z80.VarWordString
import org.efry.z80editor.z80.Undefine
import org.efry.z80editor.z80.Expr
import org.efry.z80editor.z80.VarDefinitionEnum
import org.efry.z80editor.z80.VarDefinitionStruct

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class Z80OutlineTreeProvider extends DefaultOutlineTreeProvider {
    	  
	def _isLeaf(Command operation) {
		true
	}
    
    def _text(Command operation) {
        null
    }
    
    def _text(LabelType label) {
        null
    }
    
    def _text(Asc asc) {
        null
    }
    
    def _text(EmptyFill emptyFill) {
        null
    }
    
    def _text(Expr expression) {
        null
    }

    def _isLeaf(Expr expression) {
        true
    }
    
	def _isLeaf(Org operation) {
		true
	}
	
	def _isLeaf(Define operation) {
		true
	}
	
	def _isLeaf(LabelType operation) {
		true
	}

	def _isLeaf(IncludeType operation) {
		true
	}
	
	def _isLeaf(IfOperand operation) {
		true
	}

    def _isLeaf(Asciitable asciiTable) {
        true
    }

    def _isLeaf(IfCmd ifCmd) {
        true
    }
    
    def _isLeaf(Macro macro) {
        true
    }
    
    def _isLeaf(MemoryMap mmap) {
        true
    }

    def _isLeaf(EmptyFill emptyFill) {
        true
    }

    def _isLeaf(Db db) {
        true
    }
    
    def _isLeaf(Dw dw) {
        true
    }
    
    def _isLeaf(Dsb dsb) {
        true
    }
        
    def _isLeaf(MacroUsage label) {
        true
    }
    def _text(MacroUsage macroUsage) {
        null
    }
    
    def _text(Label label) {
        if(label.varName != null && label.varName.name != null) {
            label.varName.name
        } else {
            null
        }
    }
   
    def _isLeaf(Label label) {
        true
    }
    
    def _text(VarDefinitionEnum varDefEnum) {
        null
    }

    def _isLeaf(VarDefinitionStruct varDef) {
        true
    }
    
    def _isLeaf(VarStruct varDef) {
        true
    }
    
    def _isLeaf(VarByte varDef) {
        true
    }
    
    def _isLeaf(VarWord varDef) {
        true
    }
    
    def _isLeaf(VarByteString varDef) {
        true
    }
    
    def _isLeaf(VarWordString varDef) {
        true
    }
    
    def _text(VarStruct v) {
        v.varName.name
    }   
    
    def _text(VarByte v) {
        v.varName.name
    }  
     
    def _text(VarWord v) {
        v.varName.name
    }
    
    def _text(VarByteString v) {
        v.varName.name
    }
      
    def _text(VarWordString v) {
        v.varName.name
    }  

    def _text(Undefine v) {
        null
    }  
}
