/*
 * Copyright (c) 2018 Helmut Neemann.
 * Use of this source code is governed by the GPL v3 license
 * that can be found in the LICENSE file.
 */
package de.neemann.digital.hdl.model2.expression;

import de.neemann.digital.hdl.model2.HDLNet;
import de.neemann.digital.hdl.model2.Printable;

/**
 * Represents a expression
 */
public interface Expression extends Printable {

    /**
     * Replaces a net with and expression
     *
     * @param net        the net to replace
     * @param expression the expression to use instead ot the net
     */
    void replace(HDLNet net, Expression expression);
}
