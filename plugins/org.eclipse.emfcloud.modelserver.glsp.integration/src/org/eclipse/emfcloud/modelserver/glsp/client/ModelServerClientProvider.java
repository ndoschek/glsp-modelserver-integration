/********************************************************************************
 * Copyright (c) 2021 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.emfcloud.modelserver.glsp.client;

import java.util.Optional;

import org.eclipse.emfcloud.modelserver.client.ModelServerClient;

import com.google.inject.Singleton;

@Singleton
public class ModelServerClientProvider {

   private ModelServerClient modelServerClient;

   public Optional<ModelServerClient> get() {
      return Optional.ofNullable(modelServerClient);
   }

   public void setModelServerClient(final ModelServerClient modelServerClient) {
      this.modelServerClient = modelServerClient;
   }

}
