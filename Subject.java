

	
	public interface Subject {

		public void registerObserver(Observer observer);
		public void removeObserver(Observer observer);
		public void notifyObservers();
	

	public class Channel implements Subject {
	  
	private ArrayList<Observer> observers = new ArrayList <Observer>();
	
	  private String channelName;
	  private String status;
	  
	  public Channel(String channelName, String status) {
		  this.channelName = channelName;
		  this.status = status;
	  }
	  
	  public void setChannelName(String channelName) {
		  this.channelName = channelName;
	  }
	  
	  public string getStatus() {
		  return status;
	  }
	  public void setStatus(String status) {
		  this.status = status;
		  notifyObservers();
	  }
	
	  public void notifyObservers() {
		  for (Observer obs : observers) {
			  obs.update(this.status);
		  }
	}

	

	public interface Observer {
		public void update(String status);
	}


	public class Follower implements Observer {
		
		private String followerName;
		
		public Follower(String followerName) {
			this.followerName = followerName;
		}
		
		public String getFollowerName() {
			return followerName;
		}
		public void setFollowerName() {
			this.followerName = followerName;
		
		}
		
		public void update(String status) {
			
		}
			public void play() {
				
			}
		}
	}
}
	
	


