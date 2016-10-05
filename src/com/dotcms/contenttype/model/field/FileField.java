package com.dotcms.contenttype.model.field;



import java.util.List;

import org.immutables.value.Value;

import com.dotcms.repackage.com.google.common.collect.ImmutableList;

@Value.Immutable
public abstract class FileField extends Field {

	@Override
	public Class type() {
		return FileField.class;
	}
	private static final long serialVersionUID = 1L;

	@Value.Default
	@Override
	public DataTypes dataType(){
		return DataTypes.TEXT;
	};
	@Value.Derived
	@Override
	public List<DataTypes> acceptedDataTypes(){
		return ImmutableList.of(DataTypes.TEXT);
	}
	public abstract static class Builder implements FieldBuilder {}
}