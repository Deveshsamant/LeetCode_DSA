<div align="center">

# 238. Product of Array Except Self

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffa116?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/Language-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e&logo=code)  ![Solutions](https://img.shields.io/badge/Solutions-4-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/Date-2026-06-25-0984e3?style=for-the-badge&labelColor=1a1a2e)

[![LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/product-of-array-except-self/)

</div>

---

## 🏷️ Topics

`Array` `Prefix Sum`

## 🏆 Best Performance

| Metric | This Attempt | All-time Best |
|--------|:-----------:|:------------:|
| ⚡ Runtime | 2 ms (Beats 95%) | **2 ms (Beats 95%)** |
| 💾 Memory  | 72.1 MB (Beats 27%) | **72.1 MB (Beats 27%)** |

## 💡 Solutions (4 total)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-06-25 |
| 2 | [sol2.java](./sol2.java) | `Java` | 2026-06-25 |
| 3 | [sol3.java](./sol3.java) | `Java` | 2026-06-25 |
| 4 | [sol4.java](./sol4.java) | `Java` | 2026-06-25 ← **latest** |

---

## 📋 Problem Description

Given an integer array `nums`, return *an array* `answer` *such that* `answer[i]` *is equal to the product of all the elements of* `nums` *except* `nums[i]`.

The product of any prefix or suffix of `nums` is **guaranteed** to fit in a **32-bit** integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

 

**Example 1:**

```
**Input:** nums = [1,2,3,4]
**Output:** [24,12,8,6]

```

**Example 2:**

```
**Input:** nums = [-1,1,0,-3,3]
**Output:** [0,0,9,0,0]

```

 

**Constraints:**

	- `2 <= nums.length <= 10^5`

	- `-30 <= nums[i] <= 30`

	- The input is generated such that `answer[i]` is **guaranteed** to fit in a **32-bit** integer.

 

**Follow up:** Can you solve the problem in `O(1)` extra space complexity? (The output array **does not** count as extra space for space complexity analysis.)

---

<p align="right">
  <sub>🤖 Auto-pushed by <a href="https://deveshsamant.in/">Devesh Samant</a>'s <strong>LeetSync</strong> extension</sub>
</p>
