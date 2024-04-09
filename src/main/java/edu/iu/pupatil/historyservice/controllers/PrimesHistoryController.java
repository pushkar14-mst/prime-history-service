package edu.iu.pupatil.historyservice.controllers;

import edu.iu.pupatil.historyservice.model.PrimesRecord;
import edu.iu.pupatil.historyservice.repository.IPrimesHistoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {
    private final IPrimesHistoryRepository IPrimesHistoryRepository;

    public PrimesHistoryController(
            IPrimesHistoryRepository IPrimesHistoryRepository) {
        this.IPrimesHistoryRepository = IPrimesHistoryRepository;
    }

    @GetMapping("/{customer}")
    public List<PrimesRecord> findAll(@PathVariable String customer){
        return IPrimesHistoryRepository.findAllByCustomer(customer);
    }
}