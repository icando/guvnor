/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.bpm.console.client.navigation;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.*;

import java.util.HashMap;
import java.util.Map;

/**
 * You should use refactor any navigation items builders to use NavigationBuilder
 */
@Deprecated
public abstract class NavigationItemBuilderOld extends Composite
        implements
        SelectionHandler<TreeItem>, NavigationItem {

    protected final Tree mainTree;

    protected Map<TreeItem, String> itemWidgets = new HashMap<TreeItem, String>();

    public NavigationItemBuilderOld() {

        mainTree = createTree();
        mainTree.setStyleName( "guvnor-Tree" );

        DockLayoutPanel dockLayoutPanel = new DockLayoutPanel( Style.Unit.EM );

        MenuBar menu = createMenu();
        if ( menu != null ) {
            dockLayoutPanel.addNorth( menu, 2 );
        }

        dockLayoutPanel.add( new ScrollPanel( mainTree ) );

        initWidget( dockLayoutPanel );
    }

    public abstract Tree createTree();

}
