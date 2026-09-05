package spectators; 

import org.springframework.stereotype.Service;

import ticket_agents.TicketAgent;
import ticket_agents.TicketAgentRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class SpectatorService {
	@Autowired
	private SpectatorRepository repository;
	
	@Autowired
    private TicketAgentRepository ticketAgentRepository;
	
	public List<Spectator> getAll() {
    	List<Spectator> spectators = repository.findAll();
        System.out.println(spectators);
        return spectators;
    }
	
	public Spectator getByJmbg(String jmbg) {
	    return repository.findByJmbg(jmbg);
	}
	
	public Spectator create(Spectator g) {
	    return repository.save(g);
	}
	
	public Spectator updatePartial(String jmbg, Spectator update) {
        Optional<Spectator> existingOpt = repository.findById(jmbg);
        if (existingOpt.isEmpty()) {
            return null;
        }

        Spectator existing = existingOpt.get();

        if (update.getFirstName() != null) existing.setFirstName(update.getFirstName());
        if (update.getLastName() != null) existing.setLastName(update.getLastName());
        if (update.getPhoneNumber() != null) existing.setPhoneNumber(update.getPhoneNumber());
        if (update.getEmailAddress() != null) existing.setEmailAddress(update.getEmailAddress());

        if (update.getTicketAgent() != null && update.getTicketAgent().getId() != null) {
            Optional<TicketAgent> agentOpt = ticketAgentRepository.findById(update.getTicketAgent().getId());
            agentOpt.ifPresent(existing::setTicketAgent);
        }

        return repository.save(existing);
    }
	
	public boolean existsByJmbg(String jmbg) {
	    return repository.existsById(jmbg);
	}

    public void delete(String jmbg) {
        repository.deleteById(jmbg);
    }
	
}