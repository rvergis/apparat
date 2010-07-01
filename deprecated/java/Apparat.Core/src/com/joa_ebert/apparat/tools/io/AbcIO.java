/*
 * This file is part of Apparat.
 * 
 * Apparat is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Apparat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Apparat. If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright (C) 2009 Joa Ebert
 * http://www.joa-ebert.com/
 * 
 */

package com.joa_ebert.apparat.tools.io;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.joa_ebert.apparat.abc.Abc;
import com.joa_ebert.apparat.swf.tags.ITag;
import com.joa_ebert.apparat.swf.tags.Tags;
import com.joa_ebert.apparat.swf.tags.control.DoABCTag;

/**
 * 
 * @author Joa Ebert
 * 
 */
public class AbcIO
{
	private final TagIO tagIO;
	private final List<Abc> abcs;

	public AbcIO( final File file )
	{
		tagIO = new TagIO( file );
		abcs = new LinkedList<Abc>();
	}

	public AbcIO( final String pathname )
	{
		this( new File( pathname ) );
	}

	public void close()
	{
		tagIO.close();
	}

	public List<Abc> getABCs()
	{
		return abcs;
	}

	public void read() throws IOException
	{
		tagIO.read();

		for( final ITag tag : tagIO.getTags() )
		{
			if(tag instanceof DoABCTag)
			{
			}
		}
	}

	public void write() throws IOException
	{
		tagIO.write();
	}
}