/*
 * SonarQube JavaScript Plugin
 * Copyright (C) 2011 SonarSource and Eriks Nukis
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.javascript.model.implementations.declaration;

import com.google.common.collect.Iterators;
import org.sonar.javascript.model.implementations.JavaScriptTree;
import org.sonar.javascript.model.interfaces.Tree;
import org.sonar.javascript.model.interfaces.declaration.FromClauseTree;
import org.sonar.javascript.model.interfaces.declaration.NamedExportDeclarationTree;
import org.sonar.javascript.model.interfaces.lexical.SyntaxToken;

import javax.annotation.Nullable;
import java.util.Iterator;

public class NamedExportDeclarationTreeImpl extends JavaScriptTree implements NamedExportDeclarationTree {

  private Tree object;
  private FromClauseTree fromClause;
  private Tree eos;

  public NamedExportDeclarationTreeImpl() {
    super(Kind.NAMED_EXPORT_DECLARATION);
  }

  @Override
  public SyntaxToken exportToken() {
    return exportToken();
  }

  @Override
  public Tree object() {
    return object;
  }

  @Nullable
  @Override
  public FromClauseTree fromClause() {
    return fromClause;
  }

  @Nullable
  @Override
  public Tree eos() {
    return eos;
  }

  @Override
  public Kind getKind() {
    return Kind.NAMED_EXPORT_DECLARATION;
  }

  @Override
  public Iterator<Tree> childrenIterator() {
    return Iterators.emptyIterator();
  }

}
