package co.com.sofkla.orange.model;

public class payGradeModel {
        private String title;
        private String money;
       private String minSalary;
        private String maxSalary;

        public String getTitle() {
                return title;
        }

        public void setTitle(String name) {
                this.title = name;
        }

        public String getMoney() {
                return money;
        }

        public void setMoney(String money) {
                this.money = money;
        }

        public String getMinSalary() {
                return minSalary;
        }

        public void setMinSalary(String minSalary) {
                this.minSalary = minSalary;
        }

        public String getMaxSalary() {
                return maxSalary;
        }

        public void setMaxSalary(String maxSalary) {
                this.maxSalary = maxSalary;
        }
};
