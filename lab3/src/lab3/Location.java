package lab3;

public enum Location {
	UNKNOW,
	LIGHT
	{
		@Override
        public String toString() {
            return "under the light rustle of rain";
        }
	},
	SLEEPINGPLACE
	{
		@Override
		public String toString() {
            return "Sleeping place";
        }
	}, 
	PITS
	{
		@Override
		public String toString() {
            return "Pits";
        }
	}, 
	HOLE
	{
		@Override
		public String toString() {
            return "hole";
        }
	}

}
