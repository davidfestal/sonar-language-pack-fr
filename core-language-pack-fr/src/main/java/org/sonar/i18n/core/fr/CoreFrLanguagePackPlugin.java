package org.sonar.i18n.core.fr;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.sonar.api.SonarPlugin;

/**
 * This class is the entry point for all extensions
 */
public class CoreFrLanguagePackPlugin extends SonarPlugin {

  public List getExtensions() {
    return Arrays.asList(CoreFrLanguagePack.class);
  }
}
