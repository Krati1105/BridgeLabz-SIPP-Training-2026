import java.util.ArrayList;
import java.util.List;

public class UniversityCourseManagement {
    public static abstract class CourseType {
        private final String evaluationMode;

        protected CourseType(String evaluationMode) {
            this.evaluationMode = evaluationMode;
        }

        public String getEvaluationMode() {
            return evaluationMode;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" + "evaluationMode='" + evaluationMode + '\'' + '}';
        }
    }

    public static class ExamCourse extends CourseType {
        public ExamCourse() {
            super("Exam-Based");
        }
    }

    public static class AssignmentCourse extends CourseType {
        public AssignmentCourse() {
            super("Assignment-Based");
        }
    }

    public static class ResearchCourse extends CourseType {
        public ResearchCourse() {
            super("Research-Based");
        }
    }

    public static class Course<T extends CourseType> {
        private final String name;
        private final T courseType;

        public Course(String name, T courseType) {
            this.name = name;
            this.courseType = courseType;
        }

        public String getName() {
            return name;
        }

        public T getCourseType() {
            return courseType;
        }

        @Override
        public String toString() {
            return "Course{" + "name='" + name + '\'' + ", type=" + courseType + '}';
        }
    }

    public static void displayCourseTypes(List<? extends CourseType> courseTypes) {
        System.out.println("Available evaluation schemes:");
        for (CourseType type : courseTypes) {
            System.out.println(" - " + type.getEvaluationMode());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> calculus = new Course<>("Calculus", new ExamCourse());
        Course<AssignmentCourse> creativeWriting = new Course<>("Creative Writing", new AssignmentCourse());
        Course<ResearchCourse> advancedAI = new Course<>("Advanced AI", new ResearchCourse());

        List<CourseType> evaluationTypes = new ArrayList<>();
        evaluationTypes.add(calculus.getCourseType());
        evaluationTypes.add(creativeWriting.getCourseType());
        evaluationTypes.add(advancedAI.getCourseType());

        displayCourseTypes(evaluationTypes);

        System.out.println("\nCourses in the system:");
        System.out.println(calculus);
        System.out.println(creativeWriting);
        System.out.println(advancedAI);
    }
}
