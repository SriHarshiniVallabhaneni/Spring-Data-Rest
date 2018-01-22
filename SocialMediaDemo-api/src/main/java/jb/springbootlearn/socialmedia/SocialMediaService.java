package jb.springbootlearn.socialmedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SocialMediaService {
	private List<SocialMedia> topics = new ArrayList<> (Arrays.asList(
			
					new SocialMedia("wa","Watsapp","Mostly used mobile application"),
					new SocialMedia("fb", "FaceBook","Mostly used web application"),
					new SocialMedia("ig","Instagram","Sparsely used web application")	
					));

	public List<SocialMedia> smTopics(){
		return topics;
	}
	public SocialMedia smGetTopic(String appType) {
	return topics.stream().filter(t -> t.getAppType().equals(appType)).findFirst().get();
}
	public void addSM(SocialMedia socialmedia) {
		topics.add(socialmedia);
		
	}
	
	public void putSM(String appType, SocialMedia socialmedia) {
			for(int i=0; i<topics.size();i++)
			{
				SocialMedia t=topics.get(i);
				if(t.getAppType().equals(appType))
				{
				   	topics.set(i, socialmedia);
					return;
				}
			}
		
	}
	public void deleteSM(String appType, SocialMedia socialmedia) {
		for(int i=0; i<topics.size();i++)
		{
			SocialMedia s=topics.get(i);
			if(s.getAppType().equals(appType))
			{
				topics.remove(i);
				return;
			}
		}
		
	}	

} 
