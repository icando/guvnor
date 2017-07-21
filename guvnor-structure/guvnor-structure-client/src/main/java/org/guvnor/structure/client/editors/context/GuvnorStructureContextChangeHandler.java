/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.guvnor.structure.client.editors.context;

import org.guvnor.structure.repositories.Repository;
import org.uberfire.backend.vfs.Path;

public interface GuvnorStructureContextChangeHandler {

    void onNewRepositoryAdded(final Repository repository);

    void onRepositoryDeleted(final Repository repository);

    void onNewBranchAdded(final String repositoryAlias,
                          String branchName,
                          Path branchPath);

    class HandlerRegistration {

    }
}
