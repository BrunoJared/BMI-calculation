package Entities;

public class Individual {

	

		public String Name;
		public double Height;
		public double Weight;

		public Individual() {

		}

		public Individual(String name, double height, double weight) {

			this.Name = name;
			this.Height = height;
			this.Weight = weight;
		}

		public String getNome() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public double getHeight() {
			return Height;
		}

		public void setHeight(double height) {
			Height = height;
		}

		public double getWeight() {
			return Weight;
		}

		public void setWeight(double weight) {
			Weight = weight;
		}

		public double BMI() {
			return Weight / (Height * Height);
		}

		@Override
		public String toString() {

			return "Individuo [Nome=" + Name + ", Altura=" + Height + ", Peso=" + Weight + "] ";
		}

	}

