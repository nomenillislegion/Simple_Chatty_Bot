class Test {

    public static void main(String[] args) {
        new TeamLead(1);
    }

    public static class TeamLead extends Programmer {

        int numTeamLead;

        public TeamLead(int numTeamLead) {
            super(numTeamLead);
            this.numTeamLead = numTeamLead;
            employ();
        }

        public void employ() {
            System.out.println(numTeamLead + " teamlead");
        }

    }

    public static class Programmer {
        int numProgrammer;

        public Programmer(int numProgrammer) {
            this.numProgrammer = numProgrammer;
            employ();
        }

        private void employ() {
            System.out.println(numProgrammer + " programmer");
        }
    }
}