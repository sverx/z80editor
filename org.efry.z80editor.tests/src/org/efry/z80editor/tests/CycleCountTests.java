package org.efry.z80editor.tests;


import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.efry.z80editor.Z80CycleCalculator;
import org.efry.z80editor.Z80InjectorProvider;
import org.efry.z80editor.z80.Z80Model;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@InjectWith(Z80InjectorProvider.class)
@RunWith(XtextRunner.class)
public class CycleCountTests {

	  @Inject
	  private ParseHelper<Z80Model> parser;
	  
	  @Inject
	  private ValidationTestHelper validationHelper;
	  
	  @Test
	  public void calculateAdcCyclesForHlOperandTest() throws Exception {
		  final Z80Model model = this.parser.parse("adc hl, bc\nadc hl, de\nadc a, 1 + 2 * 3\n");
		  Assert.assertNotNull(model);
		  Z80CycleCalculator cycleCalc = new Z80CycleCalculator();
		  System.out.println(cycleCalc.calculateCyclesForModel(model));
		  
	  }
	  
	  
	  @Test
	  public void calculateAdcCyclesFor8E() throws Exception {
		  final Z80Model model = this.parser.parse("adc a, (hl)\n");
		  Assert.assertNotNull(model);
		  Z80CycleCalculator cycleCalc = new Z80CycleCalculator();
		  Assert.assertEquals(cycleCalc.calculateCyclesForModel(model), 7);
		  
	  }
	  
	  @Test
	  public void calculateAdcCyclesFor8EDD() throws Exception {
		  final Z80Model model = this.parser.parse("adc a, (ix + 1)\n");
		  Assert.assertNotNull(model);
		  Z80CycleCalculator cycleCalc = new Z80CycleCalculator();
		  Assert.assertEquals(cycleCalc.calculateCyclesForModel(model), 19); 
	  }

	  @Test
	  public void calculateAdcCyclesFor8EFD() throws Exception {
		  final Z80Model model = this.parser.parse("adc a, (iy + 1)\n");
		  Assert.assertNotNull(model);
		  Z80CycleCalculator cycleCalc = new Z80CycleCalculator();
		  Assert.assertEquals(cycleCalc.calculateCyclesForModel(model), 19); 
	  }
	  
	  @Test
	  public void calculateAdcCyclesFor8F() throws Exception {
		  final Z80Model model = this.parser.parse("adc a, a\n");
		  Assert.assertNotNull(model);
		  Z80CycleCalculator cycleCalc = new Z80CycleCalculator();
		  Assert.assertEquals(cycleCalc.calculateCyclesForModel(model), 4); 
	  }
	  
	  @Test
	  public void calculateAdcCyclesFor88() throws Exception {
		  final Z80Model model = this.parser.parse("adc a, b\n");
		  Assert.assertNotNull(model);
		  Z80CycleCalculator cycleCalc = new Z80CycleCalculator();
		  Assert.assertEquals(cycleCalc.calculateCyclesForModel(model), 4); 
	  }
}
