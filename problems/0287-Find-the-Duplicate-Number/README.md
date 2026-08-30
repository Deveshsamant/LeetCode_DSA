<div align="center">

# 287. Find the Duplicate Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffa116?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/Language-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e&logo=code)  ![Solutions](https://img.shields.io/badge/Solutions-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/Date-2026-08-30-0984e3?style=for-the-badge&labelColor=1a1a2e)

[![LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/find-the-duplicate-number/)

</div>

---

## 🏷️ Topics

`Array` `Two Pointers` `Binary Search` `Bit Manipulation` `Pigeonhole Principle` `Floyd's Cycle Finding Algorithm`

## 🏆 Best Performance

| Metric | This Attempt | All-time Best |
|--------|:-----------:|:------------:|
| ⚡ Runtime | 4 ms (Beats 92%) | **4 ms (Beats 92%)** 🆕 |
| 💾 Memory  | 83.2 MB (Beats 27%) | **83.2 MB (Beats 27%)** |

> 🎉 **New personal best!** Runtime improved!

## 💡 Solutions (1 total)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-08-30 ← **latest** |

---

## 📋 Problem Description

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return *this repeated number*.

You must solve the problem **without** modifying the array `nums` and using only constant extra space.

 

**Example 1:**

```

**Input:** nums = [1,3,4,2,2]
**Output:** 2

```

**Example 2:**

```

**Input:** nums = [3,1,3,4,2]
**Output:** 3

```

**Example 3:**

```

**Input:** nums = [3,3,3,3,3]
**Output:** 3
```

 

**Constraints:**

	- `1 <= n <= 10^5`

	- `nums.length == n + 1`

	- `1 <= nums[i] <= n`

	- All the integers in `nums` appear only **once** except for **precisely one integer** which appears **two or more** times.

 

**Follow up:**

	- How can we prove that at least one duplicate number must exist in `nums`?

	- Can you solve the problem in linear runtime complexity?

---

<p align="right">
  <sub>🤖 Auto-pushed by <a href="https://deveshsamant.in/">Devesh Samant</a>'s <strong>LeetSync</strong> extension</sub>
</p>
