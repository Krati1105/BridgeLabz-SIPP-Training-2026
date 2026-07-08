import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningSystem {
    public static abstract class JobRole {
        private final String title;

        protected JobRole(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" + "title='" + title + '\'' + '}';
        }
    }

    public static class SoftwareEngineer extends JobRole {
        public SoftwareEngineer() {
            super("Software Engineer");
        }
    }

    public static class DataScientist extends JobRole {
        public DataScientist() {
            super("Data Scientist");
        }
    }

    public static class ProductManager extends JobRole {
        public ProductManager() {
            super("Product Manager");
        }
    }

    public static class Resume<T extends JobRole> {
        private final String candidateName;
        private final T role;

        public Resume(String candidateName, T role) {
            this.candidateName = candidateName;
            this.role = role;
        }

        public String getCandidateName() {
            return candidateName;
        }

        public T getRole() {
            return role;
        }

        @Override
        public String toString() {
            return "Resume{" + "candidate='" + candidateName + '\'' + ", role=" + role + '}';
        }
    }

    public static void screenResumes(List<? extends JobRole> roles) {
        System.out.println("Screening job roles:");
        for (JobRole role : roles) {
            System.out.println(" - " + role.getTitle());
        }
    }

    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println("Processing resume for " + resume.getCandidateName() + " applying for " + resume.getRole().getTitle());
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>("Rohan", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Nisha", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Amit", new ProductManager());

        processResume(seResume);
        processResume(dsResume);
        processResume(pmResume);

        List<JobRole> roleList = new ArrayList<>();
        roleList.add(seResume.getRole());
        roleList.add(dsResume.getRole());
        roleList.add(pmResume.getRole());

        screenResumes(roleList);
    }
}
