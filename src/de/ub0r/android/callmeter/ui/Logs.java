/*
 * Copyright (C) 2009-2010 Felix Bechstein, The Android Open Source Project
 * 
 * This file is part of Call Meter 3G.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; If not, see <http://www.gnu.org/licenses/>.
 */
package de.ub0r.android.callmeter.ui;

import android.app.ListActivity;
import android.os.Bundle;
import de.ub0r.android.callmeter.R;
import de.ub0r.android.callmeter.ui.prefs.Preferences;

/**
 * Callmeter's Log {@link ListActivity}.
 * 
 * @author flx
 */
public class Logs extends ListActivity {
	/** Tag for output. */
	public static final String TAG = "logs";
	/** Logs. */
	private LogAdapter adapter = null;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public final void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setTheme(Preferences.getTheme(this));
		this.setContentView(R.layout.logs);
		this.setTitle(R.string.logs);
		this.adapter = new LogAdapter(this);
		this.setListAdapter(this.adapter);
	}
}