package hulkapp9showtymdevopsbackend.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="hulk-app9-showtym-devops-mongodb-showtym-movieInfo")
public class Movies {
	
	private long movie_id;
	private String movie_name;
	private String movie_image;
	private long release_year;
	private String box_office;
	
	public Movies(long movie_id, String movie_name, String movie_image, long release_year, String box_office) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_image = movie_image;
		this.release_year = release_year;
		this.box_office = box_office;
	}

	public long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMovie_image() {
		return movie_image;
	}

	public void setMovie_image(String movie_image) {
		this.movie_image = movie_image;
	}

	public long getRelease_year() {
		return release_year;
	}

	public void setRelease_year(long release_year) {
		this.release_year = release_year;
	}

	public String getBox_office() {
		return box_office;
	}

	public void setBox_office(String box_office) {
		this.box_office = box_office;
	}
	
	

}
