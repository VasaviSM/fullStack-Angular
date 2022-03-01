package com.javaoops;


import java.util.Scanner;

class StudentMarks{
    int id, cmarks, pmarks, mmarks;
    String name;

    StudentMarks(int id,String name,int cmarks,int pmarks,int mmarks){
        this.id=id;
        this.name=name;
        this.cmarks=cmarks;
        this.pmarks=pmarks;
        this.mmarks=mmarks;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCmarks() {
        return cmarks;
    }

    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }

    public int getPmarks() {
        return pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public int getMmarks() {
        return mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double avgMarks(){
        int marks;
        marks = (this.getCmarks()+ this.getPmarks()+ this.getMmarks())/3;
        //System.out.println(marks);
        return marks;
    }
}

interface CollegeHireable {
    void suitableToHire(int marks,String com_grade,int lpa,String name);
}

class GoogleHR implements CollegeHireable{

    @Override
    public void suitableToHire(int marks, String com_grade,int lpa,String name) {
        if (marks >= 70 && com_grade == "A" && lpa <= 50){
            System.out.println("Congratulations! You are hired Google.");
        }
        else{
            System.out.println("Thank you for your interest in Google " + name + ". Better luck next time!");
        }
    }
}

class FacebookHR implements CollegeHireable{

    @Override
    public void suitableToHire(int marks, String com_grade, int lpa,String name) {
        if (marks >= 60 && com_grade == "A" || com_grade == "B" && lpa <= 45) {
            System.out.println("Congratulations! You are hired by Facebook.");
        } else {
            System.out.println("Thank you for your interest in FaceBook " + name + ". Better luck next time!");
        }
    }
}

class MicrosoftHR implements CollegeHireable{

    @Override
    public void suitableToHire(int marks, String com_grade, int lpa,String name) {
        if (marks >= 80 && com_grade == "A" && lpa <= 85) {
            System.out.println("Congratulations! You are hired by Microsoft.");
        } else {
            System.out.println("Thank you for your interest in Microsoft " + name + ". Better luck next time!");
        }
    }
}

class DellHR implements CollegeHireable {

    @Override
    public void suitableToHire(int marks, String com_grade, int lpa,String name) {
        if (marks >= 60 && com_grade == "A" || com_grade == "B" && lpa <= 25) {
            System.out.println("Congratulations! You are hired by Dell.");
        } else {
            System.out.println("Thank you for your interest in Dell " + name + ". Better luck next time!");
        }
    }
}



public class StudentHiring {
    public static void main(String[] args){

        /*StudentMarks student1 = new StudentMarks();
        student1.studentDetails(101,"Raj",40,35,50);
        FacebookHR facebook1 = new FacebookHR();
        facebook1.suitableToHire((int) student1.avgMarks(),"A",35,student1.getName());
        GoogleHR google1 = new GoogleHR();
        google1.suitableToHire((int) student1.avgMarks(),"A",35,student1.getName());
        MicrosoftHR microsoft1 = new MicrosoftHR();
        microsoft1.suitableToHire((int) student1.avgMarks(),"A",35,student1.getName());
        DellHR dell1 = new DellHR();
        dell1.suitableToHire((int) student1.avgMarks(),"A",35,student1.getName());
        System.out.println();

        StudentMarks student2 = new StudentMarks();
        student2.studentDetails(102,"Suraj",80,95,80);
        FacebookHR facebook2 = new FacebookHR();
        facebook2.suitableToHire((int) student2.avgMarks(),"A",75,student2.getName());
        GoogleHR google2 = new GoogleHR();
        google2.suitableToHire((int) student2.avgMarks(),"A",75,student2.getName());
        MicrosoftHR microsoft2 = new MicrosoftHR();
        microsoft2.suitableToHire((int) student2.avgMarks(),"A",75,student2.getName());
        DellHR dell2 = new DellHR();
        dell2.suitableToHire((int) student2.avgMarks(),"A",75,student2.getName());
*/

        /*StudentMarks[] student = new StudentMarks[5];
        FacebookHR[] fb = new FacebookHR[10];
        GoogleHR[] google = new GoogleHR[10];
        MicrosoftHR[] microsoft = new MicrosoftHR[10];
        DellHR[] dell = new DellHR[10];

        student[1].studentDetails(101,"Raj",40,35,50);
        student[1].avgMarks();
        fb[1].suitableToHire((int) student[1].avgMarks(),"A",35,student[1].getName());
        google[1].suitableToHire((int) student[1].avgMarks(),"A",35,student[1].getName());
        microsoft[1].suitableToHire((int) student[1].avgMarks(),"A",35,student[1].getName());
        dell[1].suitableToHire((int) student[1].avgMarks(),"A",35,student[1].getName());

        */

        int n;
        String name;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        StudentMarks[] student = new StudentMarks[n];
        GoogleHR[] google = new GoogleHR[n];
        FacebookHR[] fb = new FacebookHR[n];
        MicrosoftHR[] microsoft = new MicrosoftHR[n];
        DellHR[] dell = new DellHR[n];

        for(int i=0;i<n;i++){
            student[i]=new StudentMarks(101,"Raj",85,78,90);
            google[i].suitableToHire((int) student[i].avgMarks(),"B",40,student[i].getName());
            fb[i].suitableToHire((int) student[i].avgMarks(),"B",40,student[i].getName());
            microsoft[i].suitableToHire((int) student[i].avgMarks(),"B",40,student[i].getName());
            dell[i].suitableToHire((int) student[i].avgMarks(),"B",40,student[i].getName());
        }

    }
}
