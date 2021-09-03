package class20;

import java.lang.reflect.ParameterizedType;

public class MathTeacher extends Teacher{

    /*
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features
    and behaviour. Test all 4 classes
     */

    String mathTopic;




    void calculate(){
        System.out.println("teacher is calculating the sum");
    }

    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();

        mathTeacher.name="Jamal";
        mathTeacher.subjectTeacher="Math";
        mathTeacher.gradeTeacher="12th grade teaching";
        mathTeacher.mathTopic="Alegebra";
        mathTeacher.calculate();

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();

        chemistryTeacher.name="Lori";
        chemistryTeacher.subjectTeacher="Chemistry";
        chemistryTeacher.gradeTeacher="10th grade teaching";
        chemistryTeacher.chemistryTopic="Atomic Structure";
        chemistryTeacher.mixingChemicals();

        PianoTeacher pianoTeacher=new PianoTeacher();

        pianoTeacher.name="Harry";
        pianoTeacher.subjectTeacher="Music-Piano";
        pianoTeacher.gradeTeacher="6th grade teaching";
        pianoTeacher.pianoTopic="note reading";
        pianoTeacher.playingPiano();



    }


}
