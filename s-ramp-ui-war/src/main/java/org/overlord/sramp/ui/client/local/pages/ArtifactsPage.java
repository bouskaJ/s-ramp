/*
 * Copyright 2012 JBoss Inc
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
package org.overlord.sramp.ui.client.local.pages;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.overlord.sramp.ui.client.local.pages.artifacts.ArtifactFilters;
import org.overlord.sramp.ui.client.shared.ArtifactFilterBean;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Window;

/**
 * The default "Artifacts" page.
 *
 * @author eric.wittmann@redhat.com
 */
@Templated("/org/overlord/sramp/ui/client/local/site/artifacts.html#page")
@Page(path="artifacts", startingPage=true)
@Dependent
public class ArtifactsPage extends AbstractPage {

    @Inject @DataField("sramp-filter-sidebar")
    protected ArtifactFilters filters;

    /**
     * Constructor.
     */
    public ArtifactsPage() {
    }

    @PostConstruct
    protected void postConstruct() {
        filters.addValueChangeHandler(new ValueChangeHandler<ArtifactFilterBean>() {
            @Override
            public void onValueChange(ValueChangeEvent<ArtifactFilterBean> event) {
                Window.alert("Filters changed!");
            }
        });
    }

}
