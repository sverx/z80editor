package org.efry.z80editor;

import org.efry.z80editor.z80.Operation;

public enum Z80OpCodes {

	ADC("Add with Carry"),
	ADD("Add"),
	AND("Logical AND"),
	BIT("Test Bit"),
	CALL("Call"),
	CCF("Complement Carry Flag"),
	CP("Compare"),
	CPD("Compare and Decrement"),
	CPDR("Compare, Dec., Repeat"),
	CPI("Compare and Increment"),
	CPIR("Compare, Inc., Repeat"),
	CPL("Complement"),
	DAA("Decimal Adjust Acc."),
	DEC("Decrement"),
	DI("Disable Interrupts"),
	DJNZ("Dec., Jump Non-Zero"),
	EI("Enable Interrupts"),
	EX("Exchange"),
	EXX("Exchange"),
	HALT("Halt"),
	IM("Interrupt Mode"),
	IN("Input"),
	INC("Increment"),
	IND("Input and Decrement"),
	INDR("Input, Dec., Repeat"),
	INI("Input and Increment"),
	INIR("Input, Inc., Repeat"),
	JP("Jump"),
	JR("Jump"),
	LD("Load"),
	LDD("Load and Decrement"),
	LDDR("Load, Dec., Repeat"),
	LDI("Load and Increment"),
	LDIR("Load, Inc., Repeat"),
	NEG("Negate"),
	NOP("No Operation"),
	OR("Logical inclusive OR"),
	OTDR("Output, Dec., Repeat"),
	OTIR("Output, Inc., Repeat"),
	OUT("Output"),
	OUTD("Output and Decrement"),
	OUTI("Output and Increment"),
	POP("Pop"),
	PUSH("Push"),
	RES("Reset bit"),
	RET("Return"),
	RETI("Return from Interrupt"),
	RETN("Return from NMI"),
	RL("Rotate Left"),
	RLA("Rotate Left Acc."),
	RLC("Rotate Left Circular"),
	RLCA("Rotate Left Circular"),
	RLD("Rotate Left 4 bits"),
	RR("Rotate Right"),
	RRA("Rotate Right Acc."),
	RRC("Rotate Right Circular"),
	RRCA("Rotate Right Circular"),
	RRD("Rotate Right 4 bits"),
	RST("Restart"),
	SBC("Subtract with Carry"),
	SCF("Set Carry Flag"),
	SET("Set bit"),
	SLA("Shift Left Arithmetic"),
	SRA("Shift Right Arith."),
	SRL("Shift Right Logical"),
	SUB("Subtract"),
	XOR("Logical Exclusive OR");
	
	private String description;
	Z80OpCodes(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public static Z80OpCodes valueOf(Operation o) {
		Z80OpCodes opcode = null;
		if(o != null && o.getOpcode() != null) {
			try {
				opcode = Z80OpCodes.valueOf(o.getOpcode().toUpperCase());
			} catch(IllegalArgumentException e) {
				return null;
			}
		}
		return opcode;
	}
}
