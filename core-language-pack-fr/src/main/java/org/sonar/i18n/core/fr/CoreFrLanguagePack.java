package org.sonar.i18n.core.fr;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * This class is the entry point for all extensions
 */
public class CoreFrLanguagePack extends org.sonar.api.i18n.LanguagePack {

  public List<String> getPluginKeys() {
    return Arrays.asList("core", "design");
  }

  public List<Locale> getLocales() {
    return Arrays.asList(Locale.FRENCH);
  }
}
