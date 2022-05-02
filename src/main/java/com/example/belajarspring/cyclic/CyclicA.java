package com.example.belajarspring.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CyclicA {
    CyclicB cyclicB;
}
