package com.xikka.pinnedtabplugin.pinnedtab;

import hudson.Extension;
import hudson.model.PageDecorator;
import hudson.model.Descriptor;

@Extension
public class PinnedTab extends PageDecorator {

	public PinnedTab() {
		super();
		load();
	}

	@Override
	public String getDisplayName() {
		return "Pinned tab";
	}
}

