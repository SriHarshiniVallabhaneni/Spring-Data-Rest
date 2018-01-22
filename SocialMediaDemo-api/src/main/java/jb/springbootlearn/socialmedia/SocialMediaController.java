package jb.springbootlearn.socialmedia;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialMediaController {
	
    @Autowired
	private SocialMediaService socialmediaservice;
    
	@RequestMapping("/topics")
	public List<SocialMedia> smTopics() {
		return socialmediaservice.smTopics();
	}
	
	@RequestMapping("/topics/{appType}")
	public SocialMedia smGetTopic(@PathVariable String appType) {
		
		return socialmediaservice.smGetTopic(appType);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addSM(@RequestBody SocialMedia socialmedia) {
		socialmediaservice.addSM(socialmedia);
		}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{appType}")
	public void putSM(@RequestBody SocialMedia socialmedia,@PathVariable String appType) {
		socialmediaservice.putSM(appType,socialmedia);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{appType}")
	public void deleteSM(@RequestBody SocialMedia socialmedia,@PathVariable String appType) {
		socialmediaservice.deleteSM(appType,socialmedia);
	}
	
}
