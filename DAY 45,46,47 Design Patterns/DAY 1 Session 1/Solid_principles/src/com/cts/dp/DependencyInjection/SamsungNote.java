package com.cts.dp.DependencyInjection;

import com.cts.dp.interfaces.IPhone;

public class SamsungNote implements IPhone{

	@Override
	public String GetPhonePart1() {
		
		return "Display";
	}

	@Override
	public double GetPart1Cost() {
		return 500;
	}

}
