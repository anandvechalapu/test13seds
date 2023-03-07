
Generate Spring Boot Application with Controller, Service, and Repository Classes

Controller Class:

@RestController
public class UserStoryController {
    @Autowired
    private UserStoryService userStoryService;
  
    @GetMapping("/userstories")
    public ResponseEntity<?> getUserStories() {
        List<UserStory> userStories = userStoryService.getUserStories();
        return new ResponseEntity<>(userStories, HttpStatus.OK);
    }
}

Service Class:

@Service
public class UserStoryService {
    @Autowired
    private UserStoryRepository userStoryRepository;
  
    public List<UserStory> getUserStories() {
        return userStoryRepository.getUserStoriesFromJiraAPI();
    }
}

Repository Class:

@Repository
public class UserStoryRepository {
    public List<UserStory> getUserStoriesFromJiraAPI() {
        // code for fetching user stories from Jira API
    }
}