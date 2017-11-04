package cadelac.framework.blade.core.dispatch;

import cadelac.framework.blade.core.message.Dispatchable;

@FunctionalInterface
public interface StateIdMapper<D extends Dispatchable> {
	public String getStateId(final D dispatchable);
}
