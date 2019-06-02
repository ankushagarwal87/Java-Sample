package io.ankush.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private TopicRepository topicRepository;

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1","5","3"),new Topic("4","5","6")));
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		/*
		for(int i = 0; i < topics.size(); i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
				return;
			}
		}*/
		topicRepository.save(topic);
	}

	public void deleetTopic(String id) {
		//topics.removeIf(t->t.getId().equals(id));
		topicRepository.delete(id);
	}
}
