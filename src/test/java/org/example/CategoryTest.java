package org.example;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Categories.class)
@IncludeCategory(ExampleInterfaceMethod.class)
@SuiteClasses({AppTest.class}) // Note that Categories is a kind of Suite

public class CategoryTest {

}

