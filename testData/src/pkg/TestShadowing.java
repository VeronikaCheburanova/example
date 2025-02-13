package pkg;

class TestShadowing extends TestShadowingSuperClass {
  ext.Shadow.B instanceOfB = new ext.Shadow.B();
  java.util.Calendar.Builder calBuilder = new java.util.Calendar.Builder();
}

class TestShadowingSuperClass {
  static class Calendar {
    static class Builder { }
  }
}