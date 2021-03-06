package gueei.binding.plugin.abs.menu.viewAttributes;

import gueei.binding.ViewAttribute;
import gueei.binding.plugin.abs.BindableOptionsMenu;

public class DataSource extends ViewAttribute<BindableOptionsMenu, Object> {
	public DataSource(BindableOptionsMenu view) {
		super(Object.class, view, "dataSource");
	}

	private Object mSource = null;
	
	@Override
	protected void doSetAttributeValue(Object newValue) {
		if (mSource==null || !mSource.equals(newValue)){
			mSource = newValue;
			getHost().invalidate();
		}
	}

	@Override
	public Object get() {
		return mSource;
	}
}
