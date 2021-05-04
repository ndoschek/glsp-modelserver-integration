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
package org.eclipse.emfcloud.modelserver.glsp.actions.handlers;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emfcloud.modelserver.glsp.EMSModelServerAccess;
import org.eclipse.emfcloud.modelserver.glsp.model.EMSModelState;
import org.eclipse.glsp.server.actions.Action;
import org.eclipse.glsp.server.features.undoredo.UndoAction;

public class EMSUndoActionHandler
   extends EMSBasicActionHandler<UndoAction, EMSModelState, EMSModelServerAccess> {

   private static final Logger LOGGER = Logger.getLogger(EMSUndoActionHandler.class.getSimpleName());

   @Override
   public List<Action> executeAction(final UndoAction action, final EMSModelState modelState,
      final EMSModelServerAccess modelServerAccess) {

      modelServerAccess.undo().thenAccept(response -> {
         if (!response.body()) {
            LOGGER.warn("Cannot undo.");
         }
      });

      return none();
   }

}
