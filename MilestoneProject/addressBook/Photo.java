package addressBook;

/**
 * Photo Class
 * @author Jamie Lewis
 */
public class Photo {
	// Attributes
	private int photoID;
	private String file;
	private String photoDate;
	private String photoDescription;
	
	/**
	 * Default Constructor
	 */
	public Photo() {
		
	}
	
	/**
	 * Non-Default Constructor
	 * @param photoID
	 * @param file
	 * @param photoDate
	 * @param photoDescription
	 */
	public Photo(int photoID, String file, String photoDate, String photoDescription) {
		this.photoID = photoID;
		this.file = file;
		this.photoDate = photoDate;
		this.photoDescription = photoDescription;
	}

	/**
	 * photoID Getter
	 * @return photoID
	 */
	public int getPhotoID() {
		return photoID;
	}

	/**
	 * photoID Setter
	 * @param photoID
	 */
	public void setPhotoID(int photoID) {
		this.photoID = photoID;
	}

	/**
	 * file Getter
	 * @return file
	 */
	public String getFile() {
		return file;
	}

	/**
	 * file Setter
	 * @param file
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * photoDate Getter
	 * @return photoDate
	 */
	public String getPhotoDate() {
		return photoDate;
	}

	/**
	 * photoDate Setter
	 * @param photoDate
	 */
	public void setPhotoDate(String photoDate) {
		this.photoDate = photoDate;
	}

	/**
	 * photoDescription Getter
	 * @return photoDescription
	 */
	public String getPhotoDescription() {
		return photoDescription;
	}

	/**
	 * photoDescription Setter
	 * @param photoDescription
	 */
	public void setPhotoDescription(String photoDescription) {
		this.photoDescription = photoDescription;
	}

	/**
	 * Overriding toString Method
	 */
	// UPDATED to make it pretty in the console!
	@Override
	public String toString() {
		return "[Photo ID: " + photoID + "]\rFile: " + file + "\rPhoto Date: " + photoDate + "\rPhoto Description: "
				+ photoDescription;
	}
}
