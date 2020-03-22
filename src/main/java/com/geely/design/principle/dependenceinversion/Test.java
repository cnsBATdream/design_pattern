package com.geely.design.principle.dependenceinversion;

public class Test {

//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyFECourse();
//        geely.studyJavaCourse();
//    }
//
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//
//        geely.studyIMOOCCourse(new JavaCourse());
//        geely.studyIMOOCCourse(new FECourse());
//        geely.studyIMOOCCourse(new pythonCourse());
//    }
//public static void main(String[] args) {
//    Geely geely = new Geely(new JavaCourse());
//    geely.studyIMOOCCourse();
//}
public static void main(String[] args) {
    Geely geely = new Geely();
    geely.setIcon(new JavaCourse());
    geely.studyIMOOCCourse();

    geely.setIcon(new FECourse());
    geely.studyIMOOCCourse();
}


}
