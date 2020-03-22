package com.geely.design.principle.dependenceinversion;

public class Geely {

    private ICource icon;

    public void setIcon(ICource icon) {
        this.icon = icon;
    }

    public void studyIMOOCCourse(){
        icon.studyCourse();
    }

}
