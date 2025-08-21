public class Grade {
    private String courseName;
    private double score;
    private String letterGrade;

    // Constructor
    public Grade(String courseName, double score) {
        this.courseName = courseName;
        this.score = score;
        this.calculateLetterGrade();
    }

    // Calculate letter grade based on score
    private void calculateLetterGrade() {
        if (score >= 90) {
            letterGrade = "A";
        } else if (score >= 80) {
            letterGrade = "B";
        } else if (score >= 70) {
            letterGrade = "C";
        } else if (score >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
    }

    // Getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
        this.calculateLetterGrade(); // Recalculate letter grade when score changes
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    // Check if the grade is passing (score >= 60)
    public boolean isPassing() {
        return score >= 60;
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return "Course: " + courseName + 
               ", Score: " + score + 
               ", Grade: " + letterGrade;
    }
}