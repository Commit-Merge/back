mypageActivityService = (() => {

//     추가
    const activityRegister = async (activity) => {
        await fetch('/mypage/activity/regist', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(activity)
        })
    }

    return {activityRegister: activityRegister}
})();