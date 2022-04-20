package com.metric.converter.mass;

import static com.metric.converter.utils.Utils.format;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.metric.converter.Units;
import com.metric.converter.annotations.Mass;

@Component
@Mass(units = Units.MILLIGRAMS)
public class MilligramsConverter extends MassConverter {

	@Override
	public Function<Units, String> toMilligrams(double value) {
		return null;
	}

	@Override
	public Function<Units, String> toGrams(double value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<Units, String> toKilograms(double value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<Units, String> toTonne(double value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<Units, String> toOunce(double value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<Units, String> toPound(double value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Function<Units, String> toStone(double value) {
		// TODO Auto-generated method stub
		return null;
	}

}
