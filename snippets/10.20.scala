-   if (targetGitRepo != "") {
-     os.proc("git", "init").call(cwd = os.pwd / "out")
-     os.proc("git", "add", "-A").call(cwd = os.pwd / "out")
-     os.proc("git", "commit", "-am", ".").call(cwd = os.pwd / "out")
-     os.proc("git", "push", targetGitRepo, "head", "-f").call(cwd = os.pwd / "out")
-   }
- }