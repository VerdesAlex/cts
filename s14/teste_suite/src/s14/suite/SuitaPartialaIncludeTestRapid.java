package s14.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import s14.categorii.TestRapid;
import s14.teste.ConstructorMasinaTest;
import s14.teste.SetAnFabricatieTest;

import static org.junit.Assert.*;

@RunWith(Categories.class)
@Categories.IncludeCategory({TestRapid.class})
@Suite.SuiteClasses({ConstructorMasinaTest.class,SetAnFabricatieTest.class})
public class SuitaPartialaIncludeTestRapid {

}